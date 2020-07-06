// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeQueryDefinitionsRequestBuilderOps(val self: DescribeQueryDefinitionsRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionNamePrefixAsScala(value: Option[String]): DescribeQueryDefinitionsRequest.Builder = {
    value.fold(self) { v => self.queryDefinitionNamePrefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeQueryDefinitionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeQueryDefinitionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeQueryDefinitionsRequestOps(val self: DescribeQueryDefinitionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionNamePrefixAsScala: Option[String] = Option(self.queryDefinitionNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeQueryDefinitionsRequestOps {

  implicit def toDescribeQueryDefinitionsRequestBuilderOps(
      v: DescribeQueryDefinitionsRequest.Builder
  ): DescribeQueryDefinitionsRequestBuilderOps = new DescribeQueryDefinitionsRequestBuilderOps(v)

  implicit def toDescribeQueryDefinitionsRequestOps(
      v: DescribeQueryDefinitionsRequest
  ): DescribeQueryDefinitionsRequestOps = new DescribeQueryDefinitionsRequestOps(v)

}
