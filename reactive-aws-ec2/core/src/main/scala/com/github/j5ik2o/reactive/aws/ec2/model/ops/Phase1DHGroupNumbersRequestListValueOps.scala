// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase1DHGroupNumbersRequestListValueBuilderOps(val self: Phase1DHGroupNumbersRequestListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Int]): Phase1DHGroupNumbersRequestListValue.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class Phase1DHGroupNumbersRequestListValueOps(val self: Phase1DHGroupNumbersRequestListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Int] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase1DHGroupNumbersRequestListValueOps {

  implicit def toPhase1DHGroupNumbersRequestListValueBuilderOps(
      v: Phase1DHGroupNumbersRequestListValue.Builder
  ): Phase1DHGroupNumbersRequestListValueBuilderOps = new Phase1DHGroupNumbersRequestListValueBuilderOps(v)

  implicit def toPhase1DHGroupNumbersRequestListValueOps(
      v: Phase1DHGroupNumbersRequestListValue
  ): Phase1DHGroupNumbersRequestListValueOps = new Phase1DHGroupNumbersRequestListValueOps(v)

}
