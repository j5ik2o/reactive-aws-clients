// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSecurityGroupReferencesResponseBuilderOps(val self: DescribeSecurityGroupReferencesResponse.Builder)
    extends AnyVal {

  final def securityGroupReferenceSetAsScala(
      value: Option[Seq[SecurityGroupReference]]
  ): DescribeSecurityGroupReferencesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.securityGroupReferenceSet(v.asJava)
    }
  }

}

final class DescribeSecurityGroupReferencesResponseOps(val self: DescribeSecurityGroupReferencesResponse)
    extends AnyVal {

  final def securityGroupReferenceSetAsScala: Option[Seq[SecurityGroupReference]] =
    Option(self.securityGroupReferenceSet).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSecurityGroupReferencesResponseOps {

  implicit def toDescribeSecurityGroupReferencesResponseBuilderOps(
      v: DescribeSecurityGroupReferencesResponse.Builder
  ): DescribeSecurityGroupReferencesResponseBuilderOps = new DescribeSecurityGroupReferencesResponseBuilderOps(v)

  implicit def toDescribeSecurityGroupReferencesResponseOps(
      v: DescribeSecurityGroupReferencesResponse
  ): DescribeSecurityGroupReferencesResponseOps = new DescribeSecurityGroupReferencesResponseOps(v)

}
