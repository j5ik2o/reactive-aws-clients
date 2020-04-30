// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceSummaryBuilderOps(val self: StackInstanceSummary.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetIdAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.stackSetId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.region(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accountAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.account(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackIdAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.stackId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala(value: Option[StackInstanceStatus]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.status(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusReasonAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.statusReason(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def organizationalUnitIdAsScala(value: Option[String]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.organizationalUnitId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def driftStatusAsScala(value: Option[StackDriftStatus]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.driftStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastDriftCheckTimestampAsScala(value: Option[java.time.Instant]): StackInstanceSummary.Builder = {
            value.fold(self){ v => self.lastDriftCheckTimestamp(v) }
            } 


}

final class StackInstanceSummaryOps(val self: StackInstanceSummary) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackSetIdAsScala: Option[String] = Option(self.stackSetId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def regionAsScala: Option[String] = Option(self.region) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def accountAsScala: Option[String] = Option(self.account) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stackIdAsScala: Option[String] = Option(self.stackId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusAsScala: Option[StackInstanceStatus] = Option(self.status) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def statusReasonAsScala: Option[String] = Option(self.statusReason) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def organizationalUnitIdAsScala: Option[String] = Option(self.organizationalUnitId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def driftStatusAsScala: Option[StackDriftStatus] = Option(self.driftStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def lastDriftCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastDriftCheckTimestamp) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceSummaryOps {

implicit def toStackInstanceSummaryBuilderOps(v: StackInstanceSummary.Builder): StackInstanceSummaryBuilderOps = new StackInstanceSummaryBuilderOps(v)

implicit def toStackInstanceSummaryOps(v: StackInstanceSummary): StackInstanceSummaryOps = new StackInstanceSummaryOps(v)

}

