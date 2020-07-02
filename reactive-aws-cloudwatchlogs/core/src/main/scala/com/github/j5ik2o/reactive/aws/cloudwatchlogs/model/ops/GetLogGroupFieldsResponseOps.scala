// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogGroupFieldsResponseBuilderOps(val self: GetLogGroupFieldsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupFieldsAsScala(value: Option[Seq[LogGroupField]]): GetLogGroupFieldsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logGroupFields(v.asJava)
    }
  }

}

final class GetLogGroupFieldsResponseOps(val self: GetLogGroupFieldsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupFieldsAsScala: Option[Seq[LogGroupField]] =
    Option(self.logGroupFields).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogGroupFieldsResponseOps {

  implicit def toGetLogGroupFieldsResponseBuilderOps(
      v: GetLogGroupFieldsResponse.Builder
  ): GetLogGroupFieldsResponseBuilderOps = new GetLogGroupFieldsResponseBuilderOps(v)

  implicit def toGetLogGroupFieldsResponseOps(v: GetLogGroupFieldsResponse): GetLogGroupFieldsResponseOps =
    new GetLogGroupFieldsResponseOps(v)

}
