// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TimeToLiveDescriptionBuilderOps(val self: TimeToLiveDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timeToLiveStatusAsScala(value: Option[TimeToLiveStatus]): TimeToLiveDescription.Builder = {
            value.fold(self){ v => self.timeToLiveStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeNameAsScala(value: Option[String]): TimeToLiveDescription.Builder = {
            value.fold(self){ v => self.attributeName(v) }
            } 


}

final class TimeToLiveDescriptionOps(val self: TimeToLiveDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def timeToLiveStatusAsScala: Option[TimeToLiveStatus] = Option(self.timeToLiveStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeNameAsScala: Option[String] = Option(self.attributeName) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTimeToLiveDescriptionOps {

implicit def toTimeToLiveDescriptionBuilderOps(v: TimeToLiveDescription.Builder): TimeToLiveDescriptionBuilderOps = new TimeToLiveDescriptionBuilderOps(v)

implicit def toTimeToLiveDescriptionOps(v: TimeToLiveDescription): TimeToLiveDescriptionOps = new TimeToLiveDescriptionOps(v)

}

