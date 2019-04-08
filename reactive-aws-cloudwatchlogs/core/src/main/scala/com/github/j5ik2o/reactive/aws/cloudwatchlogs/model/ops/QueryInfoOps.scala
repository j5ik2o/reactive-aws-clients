// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class QueryInfoBuilderOps(val self: QueryInfo.Builder) extends AnyVal {

  final def queryIdAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.queryId(v)
    }
  } // String

  final def queryStringAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.queryString(v)
    }
  } // String

  final def statusAsScala(value: Option[QueryStatus]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // QueryStatus

  final def createTimeAsScala(value: Option[Long]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  } // Long

  final def logGroupNameAsScala(value: Option[String]): QueryInfo.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

}

final class QueryInfoOps(val self: QueryInfo) extends AnyVal {

  final def queryIdAsScala: Option[String] = Option(self.queryId) // String

  final def queryStringAsScala: Option[String] = Option(self.queryString) // String

  final def statusAsScala: Option[QueryStatus] = Option(self.status) // QueryStatus

  final def createTimeAsScala: Option[Long] = Option(self.createTime) // Long

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToQueryInfoOps {

  implicit def toQueryInfoBuilderOps(v: QueryInfo.Builder): QueryInfoBuilderOps = new QueryInfoBuilderOps(v)

  implicit def toQueryInfoOps(v: QueryInfo): QueryInfoOps = new QueryInfoOps(v)

}
