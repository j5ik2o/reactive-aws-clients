// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class Phase2DHGroupNumbersRequestListValueBuilderOps(val self: Phase2DHGroupNumbersRequestListValue.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Int]): Phase2DHGroupNumbersRequestListValue.Builder = {
    value.fold(self) { v => self.value(v) }
  }

}

final class Phase2DHGroupNumbersRequestListValueOps(val self: Phase2DHGroupNumbersRequestListValue) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Int] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPhase2DHGroupNumbersRequestListValueOps {

  implicit def toPhase2DHGroupNumbersRequestListValueBuilderOps(
      v: Phase2DHGroupNumbersRequestListValue.Builder
  ): Phase2DHGroupNumbersRequestListValueBuilderOps = new Phase2DHGroupNumbersRequestListValueBuilderOps(v)

  implicit def toPhase2DHGroupNumbersRequestListValueOps(
      v: Phase2DHGroupNumbersRequestListValue
  ): Phase2DHGroupNumbersRequestListValueOps = new Phase2DHGroupNumbersRequestListValueOps(v)

}
