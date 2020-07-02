// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class GetRecordsResponseBuilderOps(val self: GetRecordsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala(value: Option[Seq[Record]]): GetRecordsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.records(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextShardIteratorAsScala(value: Option[String]): GetRecordsResponse.Builder = {
    value.fold(self) { v => self.nextShardIterator(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def millisBehindLatestAsScala(value: Option[Long]): GetRecordsResponse.Builder = {
    value.fold(self) { v => self.millisBehindLatest(v) }
  }

}

final class GetRecordsResponseOps(val self: GetRecordsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def recordsAsScala: Option[Seq[Record]] =
    Option(self.records).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextShardIteratorAsScala: Option[String] = Option(self.nextShardIterator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def millisBehindLatestAsScala: Option[Long] = Option(self.millisBehindLatest)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetRecordsResponseOps {

  implicit def toGetRecordsResponseBuilderOps(v: GetRecordsResponse.Builder): GetRecordsResponseBuilderOps =
    new GetRecordsResponseBuilderOps(v)

  implicit def toGetRecordsResponseOps(v: GetRecordsResponse): GetRecordsResponseOps = new GetRecordsResponseOps(v)

}
