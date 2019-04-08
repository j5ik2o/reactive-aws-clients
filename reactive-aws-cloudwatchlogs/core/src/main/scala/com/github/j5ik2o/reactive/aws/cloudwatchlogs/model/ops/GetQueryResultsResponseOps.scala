// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetQueryResultsResponseBuilderOps(val self: GetQueryResultsResponse.Builder) extends AnyVal {

  final def resultsAsScala(value: Option[Seq[Seq[ResultField]]]): GetQueryResultsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.results(v.map(_.asJava).asJava)
    } // Seq[Seq[ResultField]]
  }

  final def statisticsAsScala(value: Option[QueryStatistics]): GetQueryResultsResponse.Builder = {
    value.fold(self) { v =>
      self.statistics(v)
    }
  } // QueryStatistics

  final def statusAsScala(value: Option[QueryStatus]): GetQueryResultsResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // QueryStatus

}

final class GetQueryResultsResponseOps(val self: GetQueryResultsResponse) extends AnyVal {

  final def resultsAsScala: Option[Seq[Seq[ResultField]]] = Option(self.results).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.asScala)
  } // Seq[Seq[ResultField]]

  final def statisticsAsScala: Option[QueryStatistics] = Option(self.statistics) // QueryStatistics

  final def statusAsScala: Option[QueryStatus] = Option(self.status) // QueryStatus

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetQueryResultsResponseOps {

  implicit def toGetQueryResultsResponseBuilderOps(
      v: GetQueryResultsResponse.Builder
  ): GetQueryResultsResponseBuilderOps = new GetQueryResultsResponseBuilderOps(v)

  implicit def toGetQueryResultsResponseOps(v: GetQueryResultsResponse): GetQueryResultsResponseOps =
    new GetQueryResultsResponseOps(v)

}
