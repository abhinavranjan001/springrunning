package com.abhinav.springdemo.mainpackage

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
open class REPORT_SUBSCRIPTION (

    @Id
    @Column(name = "SUBSCRIPTION_ID", nullable = false)
    open var subscriptionId :Int
)
