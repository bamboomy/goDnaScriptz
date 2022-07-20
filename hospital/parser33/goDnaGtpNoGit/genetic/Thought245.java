package genetic;
import java.util.ArrayList;
class Thought245 extends Thought{
private static ArrayList<Thought245> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 418.900699712441;
private double fd1 = 705.9893421317844;
private Thought fo0 = null;
private Thought fo1 = null;
Thought245 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought245 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought245 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought245 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought245 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought245 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought245 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought245 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought245 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought245 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought245 instance = new Thought245 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    Output.points[4][4] -= fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 200.7232494467823;
    Output.points[4][5] -= fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    double ld1 = 18.029996407929662;
        ld1 *= -1;
    ab1 = fd0 < fd1;
    Output.points[4][6] -= ld0;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ld1 > fd0;
    fb1 = ab1 && ab2;
    if (ab3) {
        boolean lb2 = false;
        ab3 = fd1 > ld0;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(ld1, fd0, fd1, ld0);
}
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 - fd0;
    if (fb1) {
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        Output.points[4][7] += fd1;
        fb0 = ad1 < ad2;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        double ld1 = 152.0592257167736;
        lb0 = ad1 > ad2;
        Thought lo2 = Thought48.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      ab1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    boolean lb2 = true;
    boolean lb3 = true;
    ab1 = ad3 > ad4;
    ab2 = fd0 < fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought182.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 - ad2;

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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 997.1704872065062;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    fd1 = ld0 - fd0;
    double ld1 = 117.14193197462664;
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    double ld2 = 447.33373154994723;
    fb1 = ld1 > ld2;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo3 = Thought115.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    ld2 = fd0 + fd1;
if(ao4 != null){
      ld0 = ao4.m3(ld1, ld2, fd0, fd1);
}
    if (fb1) {
        fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ld0, ld1, ld2, fd0);
}
        double ld4 = 112.96911305612564;
        fd0 = fd1 - ld4;
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
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m2(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    Output.points[4][8] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld0 = 643.1557758005209;
    ad3 = ad4 - fd0;
    if (fb1) {
        fb0 = !fb1;
        fd1 = ld0 - ad1;
        boolean lb1 = false;
        if (lb1) {
if(fo0 != null){
              ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
    fd1 *= -1;
    Output.points[5][0] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Output.points[5][1] -= fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && lb0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
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
    ad2 *= -1;
    Thought lo0 = Thought24.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        double ld1 = 12.271576919994464;
        boolean lb2 = false;
        ab4 = fb0 && fb1;
        lb2 = ab1 || ab2;
        Output.points[5][2] -= ld1;
        ab3 = ad1 > ad2;
        ab4 = fb0 && fb1;
        Output.points[5][3] += ad3;
        boolean lb3 = true;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              lb2 = fo1.m2();
}
if(ao2 != null){
              ao1 = ao2.m4(lb3, ab1, ab2, ab3);
}
            ad4 = fd0 + fd1;
if(ao3 != null){
              ab4 = ao3.m2(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
}
            ab1 = ab2 && ab3;
if(ao2 != null){
              ao2.m1(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
if(ao3 != null){
              lb3 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    double ld0 = 339.9164081101515;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought127.getInstance(fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fd1 < fd0;
    fb0 = !fb1;
    boolean lb1 = true;
    lb0 = lb1 && ab1;
    double ld2 = 245.31382529789954;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    fd1 = ld2 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    boolean lb0 = false;
        double ld1 = 286.89191134342326;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld1;
    Output.points[5][4] -= ad1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought105.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought393.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ld1 = ad1 - ad2;
    boolean lb4 = false;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][5] += ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Output.points[5][6] += fd1;

Thought.STACK_COUNTER++;
return lb0;
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 847.6090101481134;
    double ld1 = 223.29409740639508;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2);
}
    Output.points[5][7] += ad3;
    Output.points[5][8] -= ad4;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    fb0 = fd1 > ld0;
    ld1 *= -1;
    fb1 = ab1 && ab2;

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
          ao2.m3();
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb0 = !lb1;
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 && fb0;
    fb1 = !lb0;
    boolean lb3 = true;
    boolean lb4 = false;
    lb1 = !lb2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
}
Thought.STACK_COUNTER++;
return lb3;
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
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      ad4 = ao4.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    lb0 = !lb1;
    ad2 = ad3 - ad4;
    Output.points[6][0] -= fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    Thought lo2 = Thought32.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
    fb1 = !lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Output.points[6][1] += fd1;
    fd0 *= -1;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought328.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought154.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m3();
}
    ab4 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ab1;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ad1;
    boolean lb1 = true;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought385.getInstance(ao1, ao2, ao3, ao4);
    ad2 = ad3 + ad4;
    Thought lo3 = Thought31.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ad1 = ao4.m3();
}
    Thought lo4 = Thought40.getInstance(ab3, ab4, fb0, fb1);
    double ld5 = 298.35903052739496;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ld5, ad1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab4 = ao4.m2(ad3, ad4, fd0, fd1);
}
    fb0 = ld5 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fb1 = !lb0;
    fd1 *= -1;
    double ld6 = 543.0272831066789;
    lb1 = ld5 < ld6;

Thought.STACK_COUNTER++;
return ab1;
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
    Thought lo0 = Thought194.getInstance();
    Output.points[6][2] -= fd0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 617.2269501730469;
    fb0 = fd0 < fd1;
    boolean lb2 = true;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 < fd1;
    double ld4 = 613.8752573830191;
    fb1 = ld1 < ld4;
    lb2 = fd0 > fd1;
    ld1 = ld4 + fd0;
    if (lb3) {
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld4, fd0);
}
        fb0 = fb1 && lb2;
        Thought lo5 = Thought20.getInstance();
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = fd1 > fd0;
    Output.points[6][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 338.24207060807845;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][4] += fd0;
    ab2 = ab3 || ab4;
    double ld2 = 268.64403286364717;
    Thought lo3 = Thought28.getInstance(fd0, fd1, ld0, ld2);
    Output.points[6][5] -= fd0;

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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1();
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = ad4 > fd0;
    Output.points[6][6] -= fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb0 = fb1 || ab1;
    fd0 = fd1 - ad1;
    ab2 = ad2 < ad3;
    ab3 = !ab4;
    ad4 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought38.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
        Output.points[6][7] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Output.points[6][8] += fd1;
    fb1 = lb1 || fb0;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
        fb1 = lb1 && fb0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m2();
}
        fb1 = fd0 < fd1;
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought183.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
        }
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought106.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought392.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought365.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    boolean lb3 = true;
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb3 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[7][0] -= fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb3, ab1, ab2);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

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
    boolean lb0 = false;
    ad2 *= -1;
    ab1 = ad3 < ad4;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb0 && ab1;
        ab2 = ad3 > ad4;
        Output.points[7][1] += fd0;
        boolean lb1 = false;
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb0, ab1, ab2);
}
        ad2 *= -1;
        double ld2 = 786.924709678823;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        lb1 = lb0 && ab1;
        Output.points[7][2] += ad2;
        boolean lb3 = false;
        double ld4 = 310.60321626347104;
        ad2 = ad3 + ad4;
        fd0 *= -1;
        Output.points[7][3] += fd1;
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        boolean lb5 = true;
        ab1 = !ab2;
        ld2 = ld4 - ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
return ad2;
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
        lb0 = fb0 && fb1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
        boolean lb2 = true;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2();
}
    fb0 = !fb1;
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    Output.points[7][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb1 = true;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    double ld2 = 779.7537649732668;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = ad1 - ad2;
    fb0 = ad3 < ad4;
    boolean lb1 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m3(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    double ld2 = 517.3273563162755;
    lb0 = lb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[7][5] -= ld2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    ad2 = ad3 - ad4;

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
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
if(fo0 != null){
      fo0.m1();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought180.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
    fd0 = fd1 - ad1;
    ab4 = ad2 > ad3;
    boolean lb2 = true;
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;

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
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    if (fb0) {
        Thought lo0 = Thought387.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
if(ao2 != null){
          ao1 = ao2.m4();
}
        boolean lb1 = true;
        fb0 = fd1 < fd0;
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
        fd0 *= -1;
        fb0 = fb1 || lb1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
        lb2 = fd1 > fd0;
        fb0 = fb1 || lb1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
        lb2 = fb0 && fb1;
        double ld3 = 769.7673949307938;
        lb1 = !lb2;
        fd0 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fd1 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ad4 = ao3.m3(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        double ld0 = 630.7156151032284;
        fb1 = ad3 < ad4;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        Thought lo1 = Thought309.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        Output.points[7][6] -= ad2;
if(ao2 != null){
          ao2.m3(ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought208.getInstance(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
        Output.points[7][7] += ld0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ad1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(ab2, ab3, ab4, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + fd0;
if(ao2 != null){
      ab4 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    boolean lb1 = false;
    Thought lo2 = Thought66.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought2.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2();
}
    if (ab3) {
if(fo1 != null){
          fo1.m3(ab4, fb0, fb1, lb1);
}
        boolean lb4 = true;
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
        ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        Output.points[7][8] -= ad3;
        double ld0 = 322.1764264800435;
        fb1 = ab1 || ab2;
        double ld1 = 803.1477972639526;
if(ao3 != null){
          ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
        fd1 *= -1;
}
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought56.getInstance(fb1, fb0, fb1, fb0);
    Output.points[8][0] -= fd1;
    boolean lb2 = false;
    Output.points[8][1] += fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb2, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][2] += fd1;
    double ld0 = 88.70300714268959;
    Output.points[8][3] += ld0;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
    double ld1 = 84.51030077208574;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought342.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
        lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
        fd0 = fd1 - fd0;
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 540.8163892989589;
    Thought lo5 = Thought337.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld4, fd0, fb1, lb0, lb2, lb3);
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
}
