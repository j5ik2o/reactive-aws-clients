// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeAccountAttributesRequestBuilderOps(val self: DescribeAccountAttributesRequest.Builder)
    extends AnyVal {

  final def attributeNamesAsScala(
      value: Option[Seq[AccountAttributeName]]
  ): DescribeAccountAttributesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeNames(v.asJava)
    }
  }

}

final class DescribeAccountAttributesRequestOps(val self: DescribeAccountAttributesRequest) extends AnyVal {

  final def attributeNamesAsScala: Option[Seq[AccountAttributeName]] = Option(self.attributeNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountAttributesRequestOps {

  implicit def toDescribeAccountAttributesRequestBuilderOps(
      v: DescribeAccountAttributesRequest.Builder
  ): DescribeAccountAttributesRequestBuilderOps = new DescribeAccountAttributesRequestBuilderOps(v)

  implicit def toDescribeAccountAttributesRequestOps(
      v: DescribeAccountAttributesRequest
  ): DescribeAccountAttributesRequestOps = new DescribeAccountAttributesRequestOps(v)

}
