package jp.co.nswt.yono.sampleCRUD.application.service

import jp.co.nswt.yono.sampleCRUD.application.RecordNotFoundException
import jp.co.nswt.yono.sampleCRUD.application.input.CustomerInput
import jp.co.nswt.yono.sampleCRUD.domain.model.Customer
import jp.co.nswt.yono.sampleCRUD.domain.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class CustomerApplicationService(
        private val customerRepository: CustomerRepository
) {
    fun findAll(): List<Customer> {
        return customerRepository.findAll()

    }

    fun findById(id: Int): Customer {
        return customerRepository.findById(id) ?: throw RecordNotFoundException()
    }

    fun create(customerInput: CustomerInput): Int {
        val customer = Customer(
                name = customerInput.name!!,
                email = customerInput.email!!
        )

        return customerRepository.create(customer)
    }

    fun update(id: Int, customerInput: CustomerInput) {
        val existingCustomer = customerRepository.findById(id) ?: throw RecordNotFoundException()

        val customer = existingCustomer.copy(
                name = customerInput.name!!,
                email = customerInput.email!!
        )

        customerRepository.update(customer)
    }

    fun delete(id: Int) {
        val customer = customerRepository.findById(id) ?: throw RecordNotFoundException()
        customerRepository.delete(customer)
    }

}