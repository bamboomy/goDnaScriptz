package genetic;
import java.util.ArrayList;
class Thought186 extends Thought{
private static ArrayList<Thought186> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 409.32194090064627;
private double fd1 = 120.53010001644948;
private Thought fo0 = null;
private Thought fo1 = null;
Thought186 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought186 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought186 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought186 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought186 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought186 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought186 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought186 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought186 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought186 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought186 instance = new Thought186 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        double ld0 = 577.3069898496683;
        fb1 = fd0 < fd1;
        Thought lo1 = Thought42.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
        Output.points[6][6] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd1 = ld0 + fd0;
        Thought lo3 = Thought185.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
}
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Output.points[6][8] += fd0;
    fd1 = fd0 + fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought363.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought156.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad4 = fd0 - fd1;
    Output.points[7][0] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 - fd0;
    if (fb1) {
}
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    boolean lb2 = true;
    Output.points[7][1] += ad2;
    Output.points[7][2] -= ad3;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
    ad4 = fd0 + fd1;
    fb0 = ad1 > ad2;

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
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    Output.points[7][3] += fd0;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought286.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
        fb1 = fd1 > fd0;
    lb1 = !fb0;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}

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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      ao2.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = ad3 < ad4;
    double ld1 = 869.1668369327468;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    double ld2 = 408.2724443205527;
    ld2 = ad1 - ad2;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    lb0 = fd1 > ld1;

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
    ab2 = fd1 > fd0;
    ab3 = ab4 && fb0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    Output.points[7][4] -= fd1;
    Thought lo0 = Thought379.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought27.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao2 != null){
      lb2 = ao2.m2(lb3, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 - fd0;
    lb3 = fd1 < fd0;
    Thought lo4 = Thought253.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo5 = Thought21.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb2, lb3);
    fd1 = fd0 + fd1;
    Thought lo6 = Thought167.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb7 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}

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
if(ao1 != null){
      ad2 = ao1.m3();
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    boolean lb0 = false;
    boolean lb1 = false;

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
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
        fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Output.points[7][5] += fd1;
    lb0 = fd0 < fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (ab2) {
        ab3 = fd1 > fd0;
if(fo0 != null){
          ab4 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
        ab2 = fd0 > fd1;
        ab3 = !ab4;
        fb0 = !fb1;
        if (lb0) {
            Output.points[7][6] += fd0;
            lb1 = ab1 || ab2;
            ab3 = fd1 < fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
              fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
            Thought lo2 = Thought3.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}}
Thought.STACK_COUNTER++;
return lb1;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Output.points[7][7] -= ad1;
    fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought202.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    fb0 = ad4 < fd0;
    fb1 = !lb0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought220.getInstance(ad3, ad4, fd0, fd1);
    lb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
          ad1 = fo1.m3(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 > ad1;
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo3 = Thought312.getInstance(ad2, ad3, ad4, fd0);
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
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = ad2 < ad3;
        ad4 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ad3 > ad4;
        ab2 = !ab3;
        fd0 *= -1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
            ab2 = ab3 && ab4;
            boolean lb0 = false;
            Thought lo1 = Thought65.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
            ad3 = ad4 + fd0;
            fb0 = fb1 && lb0;
            Thought lo2 = Thought248.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
            fd1 = ad1 + ad2;
if(fo1 != null){
              ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
            ad3 = ad4 + fd0;
            fd1 = ad1 - ad2;
}}
Thought.STACK_COUNTER++;
return fb1;
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
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought144.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return fb1;
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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
        ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    Output.points[7][8] -= fd0;
    fd1 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[8][0] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Output.points[8][1] -= ad2;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return fb1;
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
      ao2.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
if(ao3 != null){
      ao3.m1();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
        fd0 = fd1 + fd0;
        ab3 = ab4 && fb0;
        fd1 *= -1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        Thought lo0 = Thought179.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
        double ld1 = 907.9230463494665;
        Thought lo2 = Thought76.getInstance(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
Thought.STACK_COUNTER++;
return ab2;
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
    ab1 = !ab2;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && lb0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 = ad4 - fd0;
    boolean lb1 = false;
    Output.points[8][2] += fd1;
    if (ab1) {
        ab2 = !ab3;
        ab4 = ad1 > ad2;
        Output.points[8][3] += ad3;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
        ab1 = ab2 && ab3;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
        lb1 = ab1 && ab2;
if(ao4 != null){
          ao4.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        lb0 = fd1 > ad1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
}
Thought.STACK_COUNTER++;
return ab4;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought320.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
    lb1 = !ab1;
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    lb0 = lb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    lb0 = !lb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought143.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
    double ld3 = 192.24251033633664;
    boolean lb4 = false;
    lb4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb4, fb0);
}
    double ld5 = 842.5327793677526;
    fb1 = ld3 < ld5;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    if (lb0) {
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld3;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld5, ad1, ad2, ad3);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[8][4] += ad4;
if(fo0 != null){
          fo1 = fo0.m4(lb1, lb4, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab4 = ad2 < ad3;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[8][5] += ad2;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
    boolean lb0 = true;
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ad3;
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
    if (fb0) {
        fb1 = !fb0;
        fb1 = !fb0;
        double ld0 = 628.7745049825897;
        Thought lo1 = Thought216.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
        Output.points[8][6] -= fd1;
if(ao1 != null){
          fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        fb0 = fb1 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = !fb0;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][7] += ad1;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fb0 = fd0 < fd1;
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought280.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
    Output.points[8][8] -= ad3;
    double ld2 = 363.3487940114727;
    boolean lb3 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
return ad1;
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
    ab1 = ab2 || ab3;
    Thought lo0 = Thought245.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 917.1672326493501;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
    boolean lb2 = false;
    ld1 = fd0 + fd1;
    boolean lb3 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    double ld1 = 224.81431914669201;
    boolean lb2 = true;
    double ld3 = 646.8939877544499;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        fd0 = fd1 + ld1;
        lb2 = ab1 && ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
        lb0 = ld3 > ad1;
        }
    Thought lo4 = Thought368.getInstance(ao3, ao4, fo0, fo1);
    boolean lb5 = true;
if(ao1 != null){
      lb2 = ao1.m2(ad2, ad3, ad4, fd0);
}
    lb5 = ab1 || ab2;
    boolean lb6 = true;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, ld3, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 *= -1;
    boolean lb7 = true;
    boolean lb8 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad3;
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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        Output.points[0][0] -= fd1;
        Output.points[0][1] -= fd0;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
        fd1 = fd0 - fd1;
if(fo0 != null){
          lb0 = fo0.m2();
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
        fb0 = fb1 && lb0;
        fd0 = fd1 + fd0;
        fd1 *= -1;
        Thought lo1 = Thought378.getInstance(fb0, fb1, lb0, fb0);
        double ld2 = 130.41495641514038;
        if (fb1) {
if(fo1 != null){
              lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
}}
Thought.STACK_COUNTER++;
return fo0;
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
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 588.7389692702877;
    fb1 = fd0 < fd1;
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1);
}
    fb1 = ab1 && ab2;
    ld0 *= -1;
    Thought lo1 = Thought62.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
    double ld2 = 789.6178527424375;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    double ld3 = 255.8896827124997;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ld3, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ld2 = ld3 + fd0;
    boolean lb4 = false;
    fb0 = fd1 < ld0;
    boolean lb5 = true;
    ld2 *= -1;

Thought.STACK_COUNTER++;
return fo0;
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
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    double ld0 = 768.3074228452715;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    Output.points[0][2] -= ad4;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = !fb0;
    fd1 = ld0 + ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fo0;
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
    ad2 = ad3 + ad4;
    if (ab1) {
        Thought lo0 = Thought0.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fd0 < fd1;
        ab1 = !ab2;
        ad1 = ad2 + ad3;
        boolean lb1 = false;
        boolean lb2 = false;
        ab1 = !ab2;
        ad4 *= -1;
        ab3 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(ad1, ad2, ad3, ad4);
}
        ab4 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo0.m2();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought138.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought13.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
        fd1 *= -1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
    double ld1 = 282.71511785821804;
    ad3 = ad4 - fd0;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd1 = ao3.m3(ld1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1);
}
    fb0 = ad2 < ad3;
    double ld2 = 589.312992676286;
if(ao3 != null){
      ao3.m3();
}
    double ld3 = 462.73241609593913;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Thought lo4 = Thought380.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    boolean lb5 = false;
    fd1 = ld1 + ld2;
    Output.points[0][3] -= ld3;

Thought.STACK_COUNTER++;
return ao4;
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
    fd1 *= -1;
    ab2 = !ab3;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    fd0 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    Output.points[0][4] += ad4;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    lb0 = !ab1;
    boolean lb1 = false;
    double ld2 = 908.4083399498435;
    ab1 = ld2 > ad1;
    ad2 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2);
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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought242.getInstance();
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    double ld2 = 678.6969992894618;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb3 = false;
    boolean lb4 = false;
    lb0 = !lb3;

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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought234.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    fd1 *= -1;
        fd0 = fd1 - fd0;
    lb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    lb1 = !fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb1);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb1);
}
    double ld4 = 13.626819012412572;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, fd0, fd1, lb2, lb3, fb0, fb1);
}
        double ld5 = 515.0647023545004;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, lb3, fb0);
}

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought322.getInstance();
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld1 = 811.8643179240769;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;

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
