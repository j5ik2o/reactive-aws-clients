// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class StartQueryRequestBuilderOps(val self: StartQueryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala(value: Option[Seq[String]]): StartQueryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logGroupNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[Long]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.startTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[Long]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.endTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala(value: Option[String]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.queryString(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala(value: Option[Int]): StartQueryRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

}

final class StartQueryRequestOps(val self: StartQueryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNamesAsScala: Option[Seq[String]] = Option(self.logGroupNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[Long] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[Long] = Option(self.endTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryStringAsScala: Option[String] = Option(self.queryString)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitAsScala: Option[Int] = Option(self.limit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartQueryRequestOps {

  implicit def toStartQueryRequestBuilderOps(v: StartQueryRequest.Builder): StartQueryRequestBuilderOps =
    new StartQueryRequestBuilderOps(v)

  implicit def toStartQueryRequestOps(v: StartQueryRequest): StartQueryRequestOps = new StartQueryRequestOps(v)

}
