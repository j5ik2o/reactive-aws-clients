// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class PhysicalResourceIdContextKeyValuePairBuilderOps(val self: PhysicalResourceIdContextKeyValuePair.Builder)
    extends AnyVal {

  final def keyAsScala(value: Option[String]): PhysicalResourceIdContextKeyValuePair.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def valueAsScala(value: Option[String]): PhysicalResourceIdContextKeyValuePair.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class PhysicalResourceIdContextKeyValuePairOps(val self: PhysicalResourceIdContextKeyValuePair) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhysicalResourceIdContextKeyValuePairOps {

  implicit def toPhysicalResourceIdContextKeyValuePairBuilderOps(
      v: PhysicalResourceIdContextKeyValuePair.Builder
  ): PhysicalResourceIdContextKeyValuePairBuilderOps = new PhysicalResourceIdContextKeyValuePairBuilderOps(v)

  implicit def toPhysicalResourceIdContextKeyValuePairOps(
      v: PhysicalResourceIdContextKeyValuePair
  ): PhysicalResourceIdContextKeyValuePairOps = new PhysicalResourceIdContextKeyValuePairOps(v)

}
