from src.harness.agentThread import AgentThread


class DefaultName(AgentThread):

    def __init__(self, config, motion_config):
        super(DefaultName, self).__init__(config, motion_config)
        self.start()

    def initialize_vars(self):
        self.locals = {}
        self.locals['isOnTask'] = None
        self.locals['myTask'] = None
        self.locals['testRoute'] = None
        self.locals['i'] = None
        self.create_aw_var('tasks', list, None)
        self.create_ar_var('route', list, None)
        self.initialize_lock('event1')

    def loop_body(self):
        if not self.locals['isOnTask']:
            if self.allAssigned(self.read_from_shared('tasks', None)):
                self.stop()
            else:
                if not self.lock('event1'):
                    return
                for self.locals['i'] in range(0, self.length(self.read_from_shared('tasks', None))):
                    if not self.read_from_shared('tasks', None)[self.locals['i']].assigned:
                        self.locals['myTask'] = self.read_from_shared('tasks', None)[self.locals['i']]
                        self.locals['testRoute'] = self.findPath(self.read_from_sensor('Motion.currentPosition'),
                                                                 self.locals['myTask'])
                        if self.pathIsClear(self.read_from_shared('route', None), self.num_agents(),
                                            self.locals['testRoute'], self.pid()):
                            self.locals['isOnTask'] = True
                            self.assign(self.locals['myTask'], self.pid())
                            self.read_from_shared('tasks', None)[self.locals['i']] = self.locals['myTask']
                            self.write_to_actuator('Motion.path', self.locals['testRoute'])
                        else:
                            self.locals['isOnTask'] = False

                self.unlock('event1')

            return
        if self.locals['isOnTask'] and self.read_from_sensor('Motion.reached'):
            self.locals['isOnTask'] = False
            return
