// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceCreditSpecificationResponseBuilderOps(
    val self: ModifyInstanceCreditSpecificationResponse.Builder
) extends AnyVal {

  final def successfulInstanceCreditSpecificationsAsScala(
      value: Option[Seq[SuccessfulInstanceCreditSpecificationItem]]
  ): ModifyInstanceCreditSpecificationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.successfulInstanceCreditSpecifications(v.asJava)
    }
  }

  final def unsuccessfulInstanceCreditSpecificationsAsScala(
      value: Option[Seq[UnsuccessfulInstanceCreditSpecificationItem]]
  ): ModifyInstanceCreditSpecificationResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.unsuccessfulInstanceCreditSpecifications(v.asJava)
    }
  }

}

final class ModifyInstanceCreditSpecificationResponseOps(val self: ModifyInstanceCreditSpecificationResponse)
    extends AnyVal {

  final def successfulInstanceCreditSpecificationsAsScala: Option[Seq[SuccessfulInstanceCreditSpecificationItem]] =
    Option(self.successfulInstanceCreditSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def unsuccessfulInstanceCreditSpecificationsAsScala: Option[Seq[UnsuccessfulInstanceCreditSpecificationItem]] =
    Option(self.unsuccessfulInstanceCreditSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceCreditSpecificationResponseOps {

  implicit def toModifyInstanceCreditSpecificationResponseBuilderOps(
      v: ModifyInstanceCreditSpecificationResponse.Builder
  ): ModifyInstanceCreditSpecificationResponseBuilderOps = new ModifyInstanceCreditSpecificationResponseBuilderOps(v)

  implicit def toModifyInstanceCreditSpecificationResponseOps(
      v: ModifyInstanceCreditSpecificationResponse
  ): ModifyInstanceCreditSpecificationResponseOps = new ModifyInstanceCreditSpecificationResponseOps(v)

}
