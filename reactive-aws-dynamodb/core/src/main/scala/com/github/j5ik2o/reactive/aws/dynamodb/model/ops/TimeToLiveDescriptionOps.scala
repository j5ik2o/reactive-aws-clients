// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TimeToLiveDescriptionBuilderOps(val self: TimeToLiveDescription.Builder) extends AnyVal {

  final def withTimeToLiveStatusAsScala(value: Option[TimeToLiveStatus]): TimeToLiveDescription.Builder = {
    value.fold(self) { v =>
      self.timeToLiveStatus(v)
    }
  } // String

  final def withAttributeNameAsScala(value: Option[String]): TimeToLiveDescription.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  } // String

}

final class TimeToLiveDescriptionOps(val self: TimeToLiveDescription) extends AnyVal {

  final def timeToLiveStatusAsScala: Option[TimeToLiveStatus] = Option(self.timeToLiveStatus) // String

  final def attributeNameAsScala: Option[String] = Option(self.attributeName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTimeToLiveDescriptionOps {

  implicit def toTimeToLiveDescriptionBuilderOps(v: TimeToLiveDescription.Builder): TimeToLiveDescriptionBuilderOps =
    new TimeToLiveDescriptionBuilderOps(v)

  implicit def toTimeToLiveDescriptionOps(v: TimeToLiveDescription): TimeToLiveDescriptionOps =
    new TimeToLiveDescriptionOps(v)

}
