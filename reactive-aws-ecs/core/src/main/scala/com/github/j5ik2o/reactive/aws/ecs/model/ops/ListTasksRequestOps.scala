// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTasksRequestBuilderOps(val self: ListTasksRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstance(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.family(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredStatusAsScala(value: Option[DesiredStatus]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.desiredStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala(value: Option[LaunchType]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

}

final class ListTasksRequestOps(val self: ListTasksRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceAsScala: Option[String] = Option(self.containerInstance)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def familyAsScala: Option[String] = Option(self.family)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startedByAsScala: Option[String] = Option(self.startedBy)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def desiredStatusAsScala: Option[DesiredStatus] = Option(self.desiredStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTasksRequestOps {

  implicit def toListTasksRequestBuilderOps(v: ListTasksRequest.Builder): ListTasksRequestBuilderOps =
    new ListTasksRequestBuilderOps(v)

  implicit def toListTasksRequestOps(v: ListTasksRequest): ListTasksRequestOps = new ListTasksRequestOps(v)

}
