// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeByoipCidrsRequestBuilderOps(val self: DescribeByoipCidrsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeByoipCidrsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeByoipCidrsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeByoipCidrsRequestOps(val self: DescribeByoipCidrsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeByoipCidrsRequestOps {

  implicit def toDescribeByoipCidrsRequestBuilderOps(
      v: DescribeByoipCidrsRequest.Builder
  ): DescribeByoipCidrsRequestBuilderOps = new DescribeByoipCidrsRequestBuilderOps(v)

  implicit def toDescribeByoipCidrsRequestOps(v: DescribeByoipCidrsRequest): DescribeByoipCidrsRequestOps =
    new DescribeByoipCidrsRequestOps(v)

}
