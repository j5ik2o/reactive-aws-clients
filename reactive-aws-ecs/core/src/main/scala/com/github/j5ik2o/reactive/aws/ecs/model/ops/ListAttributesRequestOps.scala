// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListAttributesRequestBuilderOps(val self: ListAttributesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTypeAsScala(value: Option[TargetType]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.targetType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNameAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.attributeName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeValueAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.attributeValue(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListAttributesRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

}

final class ListAttributesRequestOps(val self: ListAttributesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def targetTypeAsScala: Option[TargetType] = Option(self.targetType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNameAsScala: Option[String] = Option(self.attributeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeValueAsScala: Option[String] = Option(self.attributeValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAttributesRequestOps {

  implicit def toListAttributesRequestBuilderOps(v: ListAttributesRequest.Builder): ListAttributesRequestBuilderOps =
    new ListAttributesRequestBuilderOps(v)

  implicit def toListAttributesRequestOps(v: ListAttributesRequest): ListAttributesRequestOps =
    new ListAttributesRequestOps(v)

}
