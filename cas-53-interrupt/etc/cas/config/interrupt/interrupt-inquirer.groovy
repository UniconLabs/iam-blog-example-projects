import org.apereo.cas.interrupt.InterruptResponse

def run(final Object... args) {
    def interrupts = new ConfigSlurper().parse(new File('/etc/cas/config/interrupt/interrupts-by-service.conf').toURI().toURL())
    def service = args[2]
    def msg = interrupts[service].message
    if(msg) {
        return new InterruptResponse(msg)
    }

    InterruptResponse.none()
}
