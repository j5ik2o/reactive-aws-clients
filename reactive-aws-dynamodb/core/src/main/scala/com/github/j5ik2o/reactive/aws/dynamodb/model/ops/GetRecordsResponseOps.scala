// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetRecordsResponseBuilderOps(val self: GetRecordsResponse.Builder) extends AnyVal {

  final def recordsAsScala(value: Option[Seq[Record]]): GetRecordsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.records(v.asJava)
    }
  }

  final def nextShardIteratorAsScala(value: Option[String]): GetRecordsResponse.Builder = {
    value.fold(self) { v =>
      self.nextShardIterator(v)
    }
  }

}

final class GetRecordsResponseOps(val self: GetRecordsResponse) extends AnyVal {

  final def recordsAsScala: Option[Seq[Record]] = Option(self.records).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextShardIteratorAsScala: Option[String] = Option(self.nextShardIterator)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRecordsResponseOps {

  implicit def toGetRecordsResponseBuilderOps(v: GetRecordsResponse.Builder): GetRecordsResponseBuilderOps =
    new GetRecordsResponseBuilderOps(v)

  implicit def toGetRecordsResponseOps(v: GetRecordsResponse): GetRecordsResponseOps = new GetRecordsResponseOps(v)

}
