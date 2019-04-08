// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeInstanceCreditSpecificationsResponseBuilderOps(
    val self: DescribeInstanceCreditSpecificationsResponse.Builder
) extends AnyVal {

  final def instanceCreditSpecificationsAsScala(
      value: Option[Seq[InstanceCreditSpecification]]
  ): DescribeInstanceCreditSpecificationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instanceCreditSpecifications(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeInstanceCreditSpecificationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeInstanceCreditSpecificationsResponseOps(val self: DescribeInstanceCreditSpecificationsResponse)
    extends AnyVal {

  final def instanceCreditSpecificationsAsScala: Option[Seq[InstanceCreditSpecification]] =
    Option(self.instanceCreditSpecifications).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstanceCreditSpecificationsResponseOps {

  implicit def toDescribeInstanceCreditSpecificationsResponseBuilderOps(
      v: DescribeInstanceCreditSpecificationsResponse.Builder
  ): DescribeInstanceCreditSpecificationsResponseBuilderOps =
    new DescribeInstanceCreditSpecificationsResponseBuilderOps(v)

  implicit def toDescribeInstanceCreditSpecificationsResponseOps(
      v: DescribeInstanceCreditSpecificationsResponse
  ): DescribeInstanceCreditSpecificationsResponseOps = new DescribeInstanceCreditSpecificationsResponseOps(v)

}
