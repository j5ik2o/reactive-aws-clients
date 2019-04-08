// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeStaleSecurityGroupsRequestBuilderOps(val self: DescribeStaleSecurityGroupsRequest.Builder)
    extends AnyVal {

  final def maxResultsAsScala(value: Option[Int]): DescribeStaleSecurityGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeStaleSecurityGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): DescribeStaleSecurityGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class DescribeStaleSecurityGroupsRequestOps(val self: DescribeStaleSecurityGroupsRequest) extends AnyVal {

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStaleSecurityGroupsRequestOps {

  implicit def toDescribeStaleSecurityGroupsRequestBuilderOps(
      v: DescribeStaleSecurityGroupsRequest.Builder
  ): DescribeStaleSecurityGroupsRequestBuilderOps = new DescribeStaleSecurityGroupsRequestBuilderOps(v)

  implicit def toDescribeStaleSecurityGroupsRequestOps(
      v: DescribeStaleSecurityGroupsRequest
  ): DescribeStaleSecurityGroupsRequestOps = new DescribeStaleSecurityGroupsRequestOps(v)

}
