// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TimeToLiveSpecificationBuilderOps(val self: TimeToLiveSpecification.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): TimeToLiveSpecification.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  final def attributeNameAsScala(value: Option[String]): TimeToLiveSpecification.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  }

}

final class TimeToLiveSpecificationOps(val self: TimeToLiveSpecification) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  final def attributeNameAsScala: Option[String] = Option(self.attributeName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTimeToLiveSpecificationOps {

  implicit def toTimeToLiveSpecificationBuilderOps(
      v: TimeToLiveSpecification.Builder
  ): TimeToLiveSpecificationBuilderOps = new TimeToLiveSpecificationBuilderOps(v)

  implicit def toTimeToLiveSpecificationOps(v: TimeToLiveSpecification): TimeToLiveSpecificationOps =
    new TimeToLiveSpecificationOps(v)

}
