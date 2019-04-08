// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListShardsResponseBuilderOps(val self: ListShardsResponse.Builder) extends AnyVal {

  final def shardsAsScala(value: Option[Seq[Shard]]): ListShardsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shards(v.asJava)
    } // Seq[Shard]
  }

  final def nextTokenAsScala(value: Option[String]): ListShardsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListShardsResponseOps(val self: ListShardsResponse) extends AnyVal {

  final def shardsAsScala: Option[Seq[Shard]] = Option(self.shards).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Shard]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListShardsResponseOps {

  implicit def toListShardsResponseBuilderOps(v: ListShardsResponse.Builder): ListShardsResponseBuilderOps =
    new ListShardsResponseBuilderOps(v)

  implicit def toListShardsResponseOps(v: ListShardsResponse): ListShardsResponseOps = new ListShardsResponseOps(v)

}
