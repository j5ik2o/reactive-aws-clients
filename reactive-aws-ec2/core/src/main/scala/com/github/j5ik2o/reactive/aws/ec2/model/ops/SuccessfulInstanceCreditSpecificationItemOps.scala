// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SuccessfulInstanceCreditSpecificationItemBuilderOps(
    val self: SuccessfulInstanceCreditSpecificationItem.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): SuccessfulInstanceCreditSpecificationItem.Builder = {
    value.fold(self) { v => self.instanceId(v) }
  }

}

final class SuccessfulInstanceCreditSpecificationItemOps(val self: SuccessfulInstanceCreditSpecificationItem)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSuccessfulInstanceCreditSpecificationItemOps {

  implicit def toSuccessfulInstanceCreditSpecificationItemBuilderOps(
      v: SuccessfulInstanceCreditSpecificationItem.Builder
  ): SuccessfulInstanceCreditSpecificationItemBuilderOps = new SuccessfulInstanceCreditSpecificationItemBuilderOps(v)

  implicit def toSuccessfulInstanceCreditSpecificationItemOps(
      v: SuccessfulInstanceCreditSpecificationItem
  ): SuccessfulInstanceCreditSpecificationItemOps = new SuccessfulInstanceCreditSpecificationItemOps(v)

}
