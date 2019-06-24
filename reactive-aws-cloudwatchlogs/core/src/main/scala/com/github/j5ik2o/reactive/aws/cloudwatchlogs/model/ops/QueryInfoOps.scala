// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryInfoBuilderOps(val self: QueryInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryIdAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.queryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.queryString(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[QueryStatus]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[Long]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

}

final class QueryInfoOps(val self: QueryInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryIdAsScala: Option[String] = Option(self.queryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala: Option[String] = Option(self.queryString)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[QueryStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[Long] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryInfoOps {

  implicit def toQueryInfoBuilderOps(v: QueryInfo.Builder): QueryInfoBuilderOps = new QueryInfoBuilderOps(v)

  implicit def toQueryInfoOps(v: QueryInfo): QueryInfoOps = new QueryInfoOps(v)

}
