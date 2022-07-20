package genetic;
import java.util.ArrayList;
class Thought376 extends Thought{
private static ArrayList<Thought376> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 952.1542124069446;
private double fd1 = 633.0117772482874;
private Thought fo0 = null;
private Thought fo1 = null;
Thought376 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought376 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought376 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought376 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought376 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought376 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought376 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought376 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought376 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought376 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought376 instance = new Thought376 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought331.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        Thought lo1 = Thought53.getInstance();
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld2 = 403.03645388369455;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ld2 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld2;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 964.2747693057128;
    ld0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld1 = 384.584558057309;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = !ab2;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought316.getInstance(fo0, fo1, fo0, fo1);
    lb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought389.getInstance();
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb0, lb1);
}
    if (fb0) {
        boolean lb4 = true;
        Output.points[4][3] -= fd0;
        Thought lo5 = Thought318.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb4, lb0);
        ad4 = fd0 + fd1;
        lb1 = ad1 > ad2;
if(fo0 != null){
          fb0 = fo0.m2(ad3, ad4, fd0, fd1, fb1, lb4, lb0, lb1);
}
        ad1 = ad2 - ad3;
        if (fb0) {
if(fo1 != null){
              ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb4, lb0, lb1);
}
            fd0 = fd1 + ad1;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    double ld0 = 669.6514538004785;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab2 = !ab3;
    ld0 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ab4 = ld0 < ad1;
    fb0 = fb1 || ab1;
if(fo1 != null){
          fo1.m1(ad2, ad3, ad4, fd0);
}
    double ld1 = 394.0938980902537;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
    Output.points[4][4] -= ad2;
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb2 || ab1;
    Output.points[4][5] += ld0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought12.getInstance();
if(ao3 != null){
      ao3.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 < ad4;
    double ld1 = 488.80472293900556;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld1);
}
    lb0 = !lb2;
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1);
}
    fb0 = !fb1;
if(ao3 != null){
      ad1 = ao3.m3();
}
    Thought lo3 = Thought234.getInstance(lb0, lb2, fb0, fb1);
    ad2 = ad3 + ad4;
    Thought lo4 = Thought1.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, lb0, lb2, fb0, fb1);
    lb0 = lb2 && fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] -= fd0;
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = !ab1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought148.getInstance(ao3, ao4, fo0, fo1);
    Thought lo3 = Thought277.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m3(lb0, lb1, lb4, ab1);
}
        Thought lo5 = Thought325.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought343.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld1 = 648.9622647407217;
    ab3 = ab4 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld2 = 380.5176241341301;
    ab1 = ab2 || ab3;
    double ld3 = 445.71115444188115;
    ab4 = ad3 > ad4;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3);
}
    fb0 = !fb1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
        lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    double ld2 = 451.9670646607087;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought144.getInstance(ld2, fd0, fd1, ld2);
    fb0 = fd0 > fd1;
    boolean lb4 = false;
    boolean lb5 = false;
    double ld6 = 731.8530902876353;
    lb5 = fb0 && fb1;
    double ld7 = 373.80851478368436;
    lb0 = lb1 || lb4;
    boolean lb8 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld2, ld6, ld7, fd0);
}

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
    Thought lo0 = Thought243.getInstance();
    fd1 = fd0 + fd1;
    Thought lo1 = Thought122.getInstance(ab3, ab4, fb0, fb1);
    double ld2 = 186.67905584572745;
    ld2 = fd0 - fd1;
        ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = false;
    lb5 = !ab1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, fd0, fd1, fb1, lb3, lb4, lb5);
}
    Output.points[4][7] -= ld2;
    fd0 *= -1;
    fd1 = ld2 + fd0;
    boolean lb6 = false;

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 74.51232744042248;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    Thought lo1 = Thought102.getInstance(fo1, fo0, fo1, fo0);
    Output.points[4][8] -= ad1;
    double ld2 = 242.05437978582717;
    ad1 *= -1;
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
    ld2 = ad1 - ad2;
    ad3 = ad4 + fd0;
    Thought lo4 = Thought318.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1);
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb3 = fb0 && fb1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld0;
        boolean lb5 = true;
        lb5 = lb3 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb5, lb3, fb0);
}
        fb1 = lb5 || lb3;
        Thought lo6 = Thought397.getInstance(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, lb5, lb3);
        Output.points[5][0] -= ad4;
        fb0 = fd0 < fd1;
        fb1 = !lb5;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        boolean lb1 = true;
        lb1 = fd1 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        Thought lo2 = Thought396.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        Output.points[5][1] += ad4;
        fd0 *= -1;
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought358.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = false;
    fd0 *= -1;
    fb0 = fb1 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld2 = 145.8017010857981;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 99.77066707518578;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    if (fb1) {
        fb0 = fb1 && fb0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fd1 = ld0 - ad1;
        boolean lb1 = false;
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        double ld2 = 445.7761190233405;
        ad4 = fd0 + fd1;
        fb0 = fb1 || lb1;
if(ao2 != null){
          ao2.m2(ld2, ld0, ad1, ad2);
}
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3();
}
    Thought lo0 = Thought333.getInstance(ab2, ab3, ab4, fb0);
    fd1 *= -1;
    Output.points[5][2] += fd0;
    double ld1 = 554.3211626355736;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(fd1, ld1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > fd0;
    ab4 = !fb0;
    fd1 *= -1;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, ab1);
}
    Output.points[5][3] -= ld1;
    fd0 = fd1 - ld1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab2 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    double ld0 = 476.7384682357296;
    Thought lo1 = Thought230.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ld0 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    double ld2 = 909.9080962334594;
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ab4 || fb0;
    ld0 = ld2 + ad1;
if(ao4 != null){
      ao4.m3(fb1, ab1, ab2, ab3);
}
    if (ab4) {
        ad2 = ad3 - ad4;
        boolean lb3 = true;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, ab4, fb0, fb1, lb3);
}
        Thought lo4 = Thought154.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb3;
        ab1 = fd0 < fd1;
        boolean lb5 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        ld0 = ld2 - ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ad2 = ao4.m3(ad3, ad4, fd0, fd1);
}
        Thought lo6 = Thought118.getInstance(fo0, fo1, ao1, ao2, ld0, ld2, ad1, ad2);
if(ao3 != null){
          ao3.m1();
}
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb3, lb5);
}
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 85.09111626514392;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 56.79299900943699;
    fb1 = !fb0;
    Output.points[5][4] += ld0;
    if (fb1) {
        Thought lo2 = Thought121.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        ld1 *= -1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, ld1, fd0);
}
        fb0 = fd1 < ld0;
        ld1 *= -1;
        fd0 *= -1;
        double ld3 = 908.0133662235374;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld0);
}
        ld1 = fd0 - fd1;
        ld3 = ld0 + ld1;
        fd0 *= -1;
if(fo0 != null){
          fo0.m1();
}
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld3, ld0, ld1, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[5][5] -= fd1;
if(fo0 != null){
          fb0 = fo0.m2(ld3, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
    double ld0 = 348.82801904945575;
    double ld1 = 156.1234214513119;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought26.getInstance(fo1, fo0, fo1, fo0);
    ld1 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    Thought lo5 = Thought47.getInstance();
    lb3 = lb4 || ab1;
    Thought lo6 = Thought352.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, lb3, lb4, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo7 = Thought283.getInstance(ld1, fd0, fd1, ld0, fb0, fb1, lb3, lb4);
    ab1 = ld1 < fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo8 = Thought358.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, ld0, ld1, fd0);
}
    double ld9 = 423.7806985732194;
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought24.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    double ld1 = 233.96659013934956;
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought316.getInstance();
    ad4 = fd0 + fd1;
            fb0 = fb1 && fb0;
        Thought lo3 = Thought27.getInstance(fb1, fb0, fb1, fb0);
    Thought lo4 = Thought8.getInstance(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    Thought lo5 = Thought366.getInstance(ad4, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    double ld6 = 205.65682247755907;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld7 = 927.017294561777;
    fb1 = !fb0;
    ld6 *= -1;

Thought.STACK_COUNTER++;
return ld7;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    boolean lb0 = false;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1();
}
    fd1 = ad1 + ad2;
    Output.points[5][6] -= ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][7] -= fd0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought304.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought277.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb1 = !lb3;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
        Output.points[5][8] += ad1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo1.m2();
}
    double ld0 = 529.2261828108475;
    fb0 = ad3 < ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Output.points[6][0] += fd1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ab2 = !ab3;
    ab4 = !fb0;
    fb1 = !ab1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought83.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    Thought lo1 = Thought218.getInstance();
    boolean lb2 = false;
    double ld3 = 98.29459044880964;
    if (lb2) {
        fd0 = fd1 + ld3;
        ad1 *= -1;
        ab1 = ad2 < ad3;
if(fo0 != null){
          fo0.m2(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3, fb1, lb2, ab1, ab2);
}
        ad1 *= -1;
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        lb2 = ab1 || ab2;
        boolean lb4 = true;
        Output.points[6][1] += fd1;
        ab2 = ld3 > ad1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    double ld1 = 461.973287263961;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought156.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[6][2] += fd0;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought333.getInstance(fo0, fo1, fo0, fo1);
        Thought lo2 = Thought270.getInstance(fd0, fd1, fd0, fd1);
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    Thought lo4 = Thought318.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2();
}
    lb0 = fd0 > fd1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 - ad2;
    fb1 = ad3 > ad4;
    fb0 = fb1 && fb0;
    Output.points[6][3] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought249.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    fd1 = ad1 + ad2;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 892.4009217827216;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    double ld0 = 151.3029936182617;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    Output.points[6][4] -= ad1;
    ad2 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought143.getInstance();
    ad3 = ad4 - fd0;
    fd1 = ld0 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, ld0, ad1, ad2, fb0, fb1, lb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 69.26862580072441;
    ad2 = ad3 + ad4;
    fb1 = lb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ld0, ld3);
}
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;
    Output.points[6][5] += ld0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    Output.points[6][6] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought151.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        boolean lb0 = true;
        double ld1 = 516.1831200958088;
if(ao2 != null){
          ao2.m1(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          fb0 = ao2.m2(fd0, fd1, ld1, ad1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
        Thought lo2 = Thought146.getInstance(ao2, ao3, ao4, fo0);
        fb0 = !fb1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
        fb0 = fb1 && lb0;
        fb0 = ad3 > ad4;
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 - ld1;
if(ao2 != null){
              ao1 = ao2.m4();
}
            Thought lo3 = Thought42.getInstance(fb1, lb0, fb0, fb1);
            lb0 = fb0 || fb1;
            double ld4 = 462.332502545097;
            lb0 = fb0 || fb1;
}}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 90.22590511976509;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = ld0 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought383.getInstance(ld0, fd0, fd1, ld0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Thought lo3 = Thought225.getInstance();
    fd1 = ld0 - fd0;
    lb1 = fd1 > ld0;
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    ab1 = ab2 || ab3;
    double ld4 = 755.6629318973871;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
    double ld0 = 47.66491434015324;
if(ao2 != null){
      fb0 = ao2.m2(ld0, ad1, ad2, ad3);
}
    Thought lo1 = Thought244.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
    fb1 = !ab1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought359.getInstance();
    ad4 *= -1;
    ab2 = ab3 && ab4;
    fd0 *= -1;
    fd1 = ld0 - ad1;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    Output.points[6][7] += fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[6][8] -= fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 109.33020232613664;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    Thought lo1 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
            fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    fb0 = !fb1;
    lb0 = lb1 || fb0;
    double ld2 = 826.8569561977689;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    double ld3 = 803.3064013212985;
    boolean lb4 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
    ld2 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought83.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought238.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, lb3, lb4);
    Output.points[7][0] += fd1;
    fb0 = fd0 > fd1;
    Output.points[7][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    lb4 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
    Output.points[7][2] -= fd1;
    lb4 = fb0 || fb1;
    boolean lb6 = true;
    fd0 = fd1 + fd0;
    lb0 = !lb2;
    double ld7 = 467.86962857012026;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
