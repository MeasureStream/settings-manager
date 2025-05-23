package measuremanager.settingsmanager.dtos

import measuremanager.settingsmanager.entities.MuSetting

data class MuSettingDTO (val id:Long, val samplingFrequency : Long)

fun MuSetting.toDTO() : MuSettingDTO = MuSettingDTO(id,samplingFrequency)