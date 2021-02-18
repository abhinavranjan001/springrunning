package com.abhinav.springdemo.mainpackage

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ReportSubscriptionRepository: JpaRepository<REPORT_SUBSCRIPTION, Int>