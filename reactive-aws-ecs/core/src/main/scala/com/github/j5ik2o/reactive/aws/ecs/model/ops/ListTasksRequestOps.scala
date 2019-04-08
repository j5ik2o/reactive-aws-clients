// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListTasksRequestBuilderOps(val self: ListTasksRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def containerInstanceAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.containerInstance(v)
    }
  }

  final def familyAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.family(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def startedByAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.startedBy(v)
    }
  }

  final def serviceNameAsScala(value: Option[String]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.serviceName(v)
    }
  }

  final def desiredStatusAsScala(value: Option[DesiredStatus]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.desiredStatus(v)
    }
  }

  final def launchTypeAsScala(value: Option[LaunchType]): ListTasksRequest.Builder = {
    value.fold(self) { v =>
      self.launchType(v)
    }
  }

}

final class ListTasksRequestOps(val self: ListTasksRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def containerInstanceAsScala: Option[String] = Option(self.containerInstance)

  final def familyAsScala: Option[String] = Option(self.family)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def startedByAsScala: Option[String] = Option(self.startedBy)

  final def serviceNameAsScala: Option[String] = Option(self.serviceName)

  final def desiredStatusAsScala: Option[DesiredStatus] = Option(self.desiredStatus)

  final def launchTypeAsScala: Option[LaunchType] = Option(self.launchType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTasksRequestOps {

  implicit def toListTasksRequestBuilderOps(v: ListTasksRequest.Builder): ListTasksRequestBuilderOps =
    new ListTasksRequestBuilderOps(v)

  implicit def toListTasksRequestOps(v: ListTasksRequest): ListTasksRequestOps = new ListTasksRequestOps(v)

}
