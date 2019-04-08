// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionFamiliesRequestBuilderOps(val self: ListTaskDefinitionFamiliesRequest.Builder)
    extends AnyVal {

  final def familyPrefixAsScala(value: Option[String]): ListTaskDefinitionFamiliesRequest.Builder = {
    value.fold(self) { v =>
      self.familyPrefix(v)
    }
  }

  final def statusAsScala(value: Option[TaskDefinitionFamilyStatus]): ListTaskDefinitionFamiliesRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionFamiliesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListTaskDefinitionFamiliesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListTaskDefinitionFamiliesRequestOps(val self: ListTaskDefinitionFamiliesRequest) extends AnyVal {

  final def familyPrefixAsScala: Option[String] = Option(self.familyPrefix)

  final def statusAsScala: Option[TaskDefinitionFamilyStatus] = Option(self.status)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTaskDefinitionFamiliesRequestOps {

  implicit def toListTaskDefinitionFamiliesRequestBuilderOps(
      v: ListTaskDefinitionFamiliesRequest.Builder
  ): ListTaskDefinitionFamiliesRequestBuilderOps = new ListTaskDefinitionFamiliesRequestBuilderOps(v)

  implicit def toListTaskDefinitionFamiliesRequestOps(
      v: ListTaskDefinitionFamiliesRequest
  ): ListTaskDefinitionFamiliesRequestOps = new ListTaskDefinitionFamiliesRequestOps(v)

}
