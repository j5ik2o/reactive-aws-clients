// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListAttributesRequestBuilderOps(val self: ListAttributesRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def targetTypeAsScala(value: Option[TargetType]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.targetType(v)
    }
  }

  final def attributeNameAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  }

  final def attributeValueAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.attributeValue(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListAttributesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListAttributesRequestOps(val self: ListAttributesRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def targetTypeAsScala: Option[TargetType] = Option(self.targetType)

  final def attributeNameAsScala: Option[String] = Option(self.attributeName)

  final def attributeValueAsScala: Option[String] = Option(self.attributeValue)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAttributesRequestOps {

  implicit def toListAttributesRequestBuilderOps(v: ListAttributesRequest.Builder): ListAttributesRequestBuilderOps =
    new ListAttributesRequestBuilderOps(v)

  implicit def toListAttributesRequestOps(v: ListAttributesRequest): ListAttributesRequestOps =
    new ListAttributesRequestOps(v)

}
