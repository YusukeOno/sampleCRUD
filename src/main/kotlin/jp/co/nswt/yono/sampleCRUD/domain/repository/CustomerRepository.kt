package jp.co.nswt.yono.sampleCRUD.domain.repository

import jp.co.nswt.yono.sampleCRUD.domain.model.Customer

interface CustomerRepository {
    fun findAll(): List<Customer>
    fun findById(id: Int): Customer?
    fun create(customer: Customer): Int
    fun update(customer: Customer)
    fun delete(customer: Customer)
}