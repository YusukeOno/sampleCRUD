package jp.co.nswt.yono.sampleCRUD.application.input

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class CustomerInput {
    @NotBlank
    @Size(max = 20)
    var name: String? = null

    @NotBlank
    @Size(max = 50)
    var email: String? = null
}