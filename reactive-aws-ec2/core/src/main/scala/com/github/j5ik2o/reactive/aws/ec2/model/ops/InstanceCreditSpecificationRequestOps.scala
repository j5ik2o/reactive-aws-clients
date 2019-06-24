// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceCreditSpecificationRequestBuilderOps(val self: InstanceCreditSpecificationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): InstanceCreditSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuCreditsAsScala(value: Option[String]): InstanceCreditSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.cpuCredits(v)
    }
  }

}

final class InstanceCreditSpecificationRequestOps(val self: InstanceCreditSpecificationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def cpuCreditsAsScala: Option[String] = Option(self.cpuCredits)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceCreditSpecificationRequestOps {

  implicit def toInstanceCreditSpecificationRequestBuilderOps(
      v: InstanceCreditSpecificationRequest.Builder
  ): InstanceCreditSpecificationRequestBuilderOps = new InstanceCreditSpecificationRequestBuilderOps(v)

  implicit def toInstanceCreditSpecificationRequestOps(
      v: InstanceCreditSpecificationRequest
  ): InstanceCreditSpecificationRequestOps = new InstanceCreditSpecificationRequestOps(v)

}
