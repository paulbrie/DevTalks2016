// NativeModules is a container for our custom modules
import { NativeModules } from 'react-native';

// for simplicity we expose ToastAndroid as JS module
module.exports = NativeModules.ToastAndroid;