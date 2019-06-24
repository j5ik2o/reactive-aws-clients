// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeIamInstanceProfileAssociationsResponseBuilderOps(
    val self: DescribeIamInstanceProfileAssociationsResponse.Builder
) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationsAsScala(
      value: Option[Seq[IamInstanceProfileAssociation]]
  ): DescribeIamInstanceProfileAssociationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.iamInstanceProfileAssociations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeIamInstanceProfileAssociationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeIamInstanceProfileAssociationsResponseOps(val self: DescribeIamInstanceProfileAssociationsResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def iamInstanceProfileAssociationsAsScala: Option[Seq[IamInstanceProfileAssociation]] =
    Option(self.iamInstanceProfileAssociations).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
