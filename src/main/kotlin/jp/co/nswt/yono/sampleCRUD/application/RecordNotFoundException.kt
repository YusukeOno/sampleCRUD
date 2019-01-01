package jp.co.nswt.yono.sampleCRUD.application

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

@ResponseStatus(HttpStatus.NOT_FOUND)
class RecordNotFoundException(): RuntimeException()
