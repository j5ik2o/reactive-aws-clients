// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ModifyInstanceCreditSpecificationRequestBuilderOps(
    val self: ModifyInstanceCreditSpecificationRequest.Builder
) extends AnyVal {

  final def clientTokenAsScala(value: Option[String]): ModifyInstanceCreditSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def instanceCreditSpecificationsAsScala(
      value: Option[Seq[InstanceCreditSpecificationRequest]]
  ): ModifyInstanceCreditSpecificationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceCreditSpecifications(v.asJava)
    }
  }

}

final class ModifyInstanceCreditSpecificationRequestOps(val self: ModifyInstanceCreditSpecificationRequest)
    extends AnyVal {

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def instanceCreditSpecificationsAsScala: Option[Seq[InstanceCreditSpecificationRequest]] =
    Option(self.instanceCreditSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToModifyInstanceCreditSpecificationRequestOps {

  implicit def toModifyInstanceCreditSpecificationRequestBuilderOps(
      v: ModifyInstanceCreditSpecificationRequest.Builder
  ): ModifyInstanceCreditSpecificationRequestBuilderOps = new ModifyInstanceCreditSpecificationRequestBuilderOps(v)

  implicit def toModifyInstanceCreditSpecificationRequestOps(
      v: ModifyInstanceCreditSpecificationRequest
  ): ModifyInstanceCreditSpecificationRequestOps = new ModifyInstanceCreditSpecificationRequestOps(v)

}
