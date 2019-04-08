// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIamInstanceProfileAssociationsResponseBuilderOps(
    val self: DescribeIamInstanceProfileAssociationsResponse.Builder
) extends AnyVal {

  final def iamInstanceProfileAssociationsAsScala(
      value: Option[Seq[IamInstanceProfileAssociation]]
  ): DescribeIamInstanceProfileAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.iamInstanceProfileAssociations(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeIamInstanceProfileAssociationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeIamInstanceProfileAssociationsResponseOps(val self: DescribeIamInstanceProfileAssociationsResponse)
    extends AnyVal {

  final def iamInstanceProfileAssociationsAsScala: Option[Seq[IamInstanceProfileAssociation]] =
    Option(self.iamInstanceProfileAssociations).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeIamInstanceProfileAssociationsResponseOps {

  implicit def toDescribeIamInstanceProfileAssociationsResponseBuilderOps(
      v: DescribeIamInstanceProfileAssociationsResponse.Builder
  ): DescribeIamInstanceProfileAssociationsResponseBuilderOps =
    new DescribeIamInstanceProfileAssociationsResponseBuilderOps(v)

  implicit def toDescribeIamInstanceProfileAssociationsResponseOps(
      v: DescribeIamInstanceProfileAssociationsResponse
  ): DescribeIamInstanceProfileAssociationsResponseOps = new DescribeIamInstanceProfileAssociationsResponseOps(v)

}
