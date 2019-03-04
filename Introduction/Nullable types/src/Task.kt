fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
    client?.personalInfo?.email?.let { message?.let { it1 -> mailer.sendMessage(it, it1) } }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
