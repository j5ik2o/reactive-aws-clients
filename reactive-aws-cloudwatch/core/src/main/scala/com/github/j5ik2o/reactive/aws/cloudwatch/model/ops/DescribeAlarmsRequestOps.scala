// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DescribeAlarmsRequestBuilderOps(val self: DescribeAlarmsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamesAsScala(value: Option[Seq[String]]): DescribeAlarmsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamePrefixAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.alarmNamePrefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala(value: Option[StateValue]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.stateValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionPrefixAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.actionPrefix(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala(value: Option[Int]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAlarmsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAlarmsRequestOps(val self: DescribeAlarmsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamesAsScala: Option[Seq[String]] = Option(self.alarmNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamePrefixAsScala: Option[String] = Option(self.alarmNamePrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateValueAsScala: Option[StateValue] = Option(self.stateValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionPrefixAsScala: Option[String] = Option(self.actionPrefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAlarmsRequestOps {

  implicit def toDescribeAlarmsRequestBuilderOps(v: DescribeAlarmsRequest.Builder): DescribeAlarmsRequestBuilderOps =
    new DescribeAlarmsRequestBuilderOps(v)

  implicit def toDescribeAlarmsRequestOps(v: DescribeAlarmsRequest): DescribeAlarmsRequestOps =
    new DescribeAlarmsRequestOps(v)

}
