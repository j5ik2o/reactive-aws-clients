// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTaskDefinitionsRequestBuilderOps(val self: ListTaskDefinitionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyPrefixAsScala(value: Option[String]): ListTaskDefinitionsRequest.Builder = {
    value.fold(self) { v =>
      self.familyPrefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[TaskDefinitionStatus]): ListTaskDefinitionsRequest.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortAsScala(value: Option[SortOrder]): ListTaskDefinitionsRequest.Builder = {
    value.fold(self) { v =>
      self.sort(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTaskDefinitionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTaskDefinitionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class ListTaskDefinitionsRequestOps(val self: ListTaskDefinitionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyPrefixAsScala: Option[String] = Option(self.familyPrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[TaskDefinitionStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sortAsScala: Option[SortOrder] = Option(self.sort)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTaskDefinitionsRequestOps {

  implicit def toListTaskDefinitionsRequestBuilderOps(
      v: ListTaskDefinitionsRequest.Builder
  ): ListTaskDefinitionsRequestBuilderOps = new ListTaskDefinitionsRequestBuilderOps(v)

  implicit def toListTaskDefinitionsRequestOps(v: ListTaskDefinitionsRequest): ListTaskDefinitionsRequestOps =
    new ListTaskDefinitionsRequestOps(v)

}
