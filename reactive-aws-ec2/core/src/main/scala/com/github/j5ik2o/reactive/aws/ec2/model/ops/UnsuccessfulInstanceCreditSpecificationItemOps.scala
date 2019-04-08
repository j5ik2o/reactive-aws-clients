// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnsuccessfulInstanceCreditSpecificationItemBuilderOps(
    val self: UnsuccessfulInstanceCreditSpecificationItem.Builder
) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): UnsuccessfulInstanceCreditSpecificationItem.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def errorAsScala(
      value: Option[UnsuccessfulInstanceCreditSpecificationItemError]
  ): UnsuccessfulInstanceCreditSpecificationItem.Builder = {
    value.fold(self) { v =>
      self.error(v)
    }
  }

}

final class UnsuccessfulInstanceCreditSpecificationItemOps(val self: UnsuccessfulInstanceCreditSpecificationItem)
    extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def errorAsScala: Option[UnsuccessfulInstanceCreditSpecificationItemError] = Option(self.error)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnsuccessfulInstanceCreditSpecificationItemOps {

  implicit def toUnsuccessfulInstanceCreditSpecificationItemBuilderOps(
      v: UnsuccessfulInstanceCreditSpecificationItem.Builder
  ): UnsuccessfulInstanceCreditSpecificationItemBuilderOps =
    new UnsuccessfulInstanceCreditSpecificationItemBuilderOps(v)

  implicit def toUnsuccessfulInstanceCreditSpecificationItemOps(
      v: UnsuccessfulInstanceCreditSpecificationItem
  ): UnsuccessfulInstanceCreditSpecificationItemOps = new UnsuccessfulInstanceCreditSpecificationItemOps(v)

}
