// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class BundleTaskBuilderOps(val self: BundleTask.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleIdAsScala(value: Option[String]): BundleTask.Builder = {
            value.fold(self){ v => self.bundleId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskErrorAsScala(value: Option[BundleTaskError]): BundleTask.Builder = {
            value.fold(self){ v => self.bundleTaskError(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala(value: Option[String]): BundleTask.Builder = {
            value.fold(self){ v => self.instanceId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def progressAsScala(value: Option[String]): BundleTask.Builder = {
            value.fold(self){ v => self.progress(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startTimeAsScala(value: Option[java.time.Instant]): BundleTask.Builder = {
            value.fold(self){ v => self.startTime(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala(value: Option[BundleTaskState]): BundleTask.Builder = {
            value.fold(self){ v => self.state(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageAsScala(value: Option[Storage]): BundleTask.Builder = {
            value.fold(self){ v => self.storage(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def updateTimeAsScala(value: Option[java.time.Instant]): BundleTask.Builder = {
            value.fold(self){ v => self.updateTime(v) }
            } 


}

final class BundleTaskOps(val self: BundleTask) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleIdAsScala: Option[String] = Option(self.bundleId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def bundleTaskErrorAsScala: Option[BundleTaskError] = Option(self.bundleTaskError) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def instanceIdAsScala: Option[String] = Option(self.instanceId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def progressAsScala: Option[String] = Option(self.progress) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def stateAsScala: Option[BundleTaskState] = Option(self.state) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def storageAsScala: Option[Storage] = Option(self.storage) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def updateTimeAsScala: Option[java.time.Instant] = Option(self.updateTime) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBundleTaskOps {

implicit def toBundleTaskBuilderOps(v: BundleTask.Builder): BundleTaskBuilderOps = new BundleTaskBuilderOps(v)

implicit def toBundleTaskOps(v: BundleTask): BundleTaskOps = new BundleTaskOps(v)

}

