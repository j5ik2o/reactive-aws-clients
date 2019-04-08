// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSecurityGroupReferencesRequestBuilderOps(val self: DescribeSecurityGroupReferencesRequest.Builder)
    extends AnyVal {

  final def groupIdAsScala(value: Option[Seq[String]]): DescribeSecurityGroupReferencesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupId(v.asJava)
    }
  }

}

final class DescribeSecurityGroupReferencesRequestOps(val self: DescribeSecurityGroupReferencesRequest) extends AnyVal {

  final def groupIdAsScala: Option[Seq[String]] = Option(self.groupId).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSecurityGroupReferencesRequestOps {

  implicit def toDescribeSecurityGroupReferencesRequestBuilderOps(
      v: DescribeSecurityGroupReferencesRequest.Builder
  ): DescribeSecurityGroupReferencesRequestBuilderOps = new DescribeSecurityGroupReferencesRequestBuilderOps(v)

  implicit def toDescribeSecurityGroupReferencesRequestOps(
      v: DescribeSecurityGroupReferencesRequest
  ): DescribeSecurityGroupReferencesRequestOps = new DescribeSecurityGroupReferencesRequestOps(v)

}
