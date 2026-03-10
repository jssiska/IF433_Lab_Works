package oop_00000114416_Jessiska.week06

fun main() {
    val lamp = SmartLamp("l", "Ruang Tamu")
    val speaker = SmartSpeaker("s", "Google Nest Dapur")
    val cctv = SmartCCTV("c", "Ezviz Garasi")
    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()

}