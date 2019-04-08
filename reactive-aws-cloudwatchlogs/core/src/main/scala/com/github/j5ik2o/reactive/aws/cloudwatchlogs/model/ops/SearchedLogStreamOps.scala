// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class SearchedLogStreamBuilderOps(val self: SearchedLogStream.Builder) extends AnyVal {

  final def logStreamNameAsScala(value: Option[String]): SearchedLogStream.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  } // String

  final def searchedCompletelyAsScala(value: Option[Boolean]): SearchedLogStream.Builder = {
    value.fold(self) { v =>
      self.searchedCompletely(v)
    }
  } // Boolean

}

final class SearchedLogStreamOps(val self: SearchedLogStream) extends AnyVal {

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName) // String

  final def searchedCompletelyAsScala: Option[Boolean] = Option(self.searchedCompletely) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchedLogStreamOps {

  implicit def toSearchedLogStreamBuilderOps(v: SearchedLogStream.Builder): SearchedLogStreamBuilderOps =
    new SearchedLogStreamBuilderOps(v)

  implicit def toSearchedLogStreamOps(v: SearchedLogStream): SearchedLogStreamOps = new SearchedLogStreamOps(v)

}
