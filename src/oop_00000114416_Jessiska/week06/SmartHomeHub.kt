package oop_00000114416_Jessiska.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice){devices.add(device)}

    fun turnOffAllSwitches(){
        for (device in devices){
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}